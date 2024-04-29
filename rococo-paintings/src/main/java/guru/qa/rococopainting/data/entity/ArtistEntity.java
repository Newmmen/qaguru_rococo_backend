package guru.qa.rococopainting.data.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Artist;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;

@Getter
@Setter
@Entity
@Table(name = "\"artist\"")
public class ArtistEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column()
    private String biography;

    @Column(name = "photo", columnDefinition = "MEDIUMTEXT")
    private String photo;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass =
                o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() :
                        o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ?
                ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        ArtistEntity that = (ArtistEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ?
                ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() :
                getClass().hashCode();
    }

    public static @NotNull Artist toGrpcMessage(@NotNull ArtistEntity artistEntity) {

        return Artist.newBuilder()
                .setId(artistEntity.getId().toString())
                .setName(artistEntity.getName())
                .setBiography(artistEntity.getBiography())
                .setPhoto(artistEntity.getPhoto())
                .build();
    }
}
