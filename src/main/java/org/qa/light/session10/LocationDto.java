package org.qa.light.session10;

import lombok.Data;
import org.openqa.selenium.interactions.Coordinates;

@Data
public class LocationDto {
    private StreetDto street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private CoordinatesDto coordinates;
    private TimezoneDto timezone;
}
