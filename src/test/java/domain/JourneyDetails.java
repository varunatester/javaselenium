package domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JourneyDetails {


    private Boolean isOneWayJourney;
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfInfants;

}
