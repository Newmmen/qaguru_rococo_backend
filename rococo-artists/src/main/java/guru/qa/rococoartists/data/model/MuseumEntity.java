package guru.qa.rococoartists.data.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import guru.qa.grpc.rococo.grpc.Museum;
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
@Table(name = "\"museum\"")
public class MuseumEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "city")
    private String city;

    @Column(name = "content", columnDefinition = "MEDIUMTEXT")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private CountryEntity countryEntity;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        MuseumEntity that = (MuseumEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

    public static @NotNull Museum toGrpcMessage(@NotNull MuseumEntity museumEntity) {

        return Museum.newBuilder()
                .setId(museumEntity.getId().toString())
                .setTitle(museumEntity.getTitle())
                .setPhoto(museumEntity.getPhoto())
                .setDescription(museumEntity.getDescription())
                .setCity(museumEntity.getCity())
                .setCountry(CountryEntity.toGrpcMessage(museumEntity.getCountryEntity()))
                .build();
    }
}
