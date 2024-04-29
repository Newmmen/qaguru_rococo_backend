package guru.qa.rococo.model;

import java.util.UUID;

//todo мб не сработает и надо будет делать дто для айдишников artistId, museumId)
public record NewMuseumDto(String description,GeolocationDto geo, String photo, String title) {

}
