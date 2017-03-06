package domain;

import utils.DateUtil;

public class JourneyDetailsBuilder {

    JourneyDetails journeyDetails;
    private Boolean oneWayJourney = true;
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfAdultsTravelling = 1;
    private int numberOfChildrenTravelling = 0;
    private int numberOfInfantsTravelling = 0;

    public JourneyDetailsBuilder isOneWay(Boolean oneWayJourney) {
        this.oneWayJourney = oneWayJourney;
        return this;
    }

    public JourneyDetails build() {
        return journeyDetails;
    }


    public JourneyDetailsBuilder() {
        journeyDetails = new JourneyDetails();
        journeyDetails.setIsOneWayJourney(true);
        journeyDetails.setOrigin("Berlin");
        journeyDetails.setDestination("Prague");
        journeyDetails.setDepartureDate(new DateUtil().tomorrow());
        journeyDetails.setNumberOfAdults(1);
        journeyDetails.setNumberOfChildren(0);
        journeyDetails.setNumberOfInfants(0);
    }


}