package domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JourneyDetails {

    public Boolean isOneWayJourney;
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfInfants;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Boolean getOneWayJourney() {
        return isOneWayJourney;
    }

    public void setOneWayJourney(Boolean oneWayJourney) {
        isOneWayJourney = oneWayJourney;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfInfants() {
        return numberOfInfants;
    }

    public void setNumberOfInfants(int numberOfInfants) {
        this.numberOfInfants = numberOfInfants;
    }

}
