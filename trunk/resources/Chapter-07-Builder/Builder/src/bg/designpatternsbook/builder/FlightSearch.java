package bg.designpatternsbook.builder;

import java.util.Date;

public class FlightSearch {
    private final String source;
    private final String destination;
    private final Date departureDate;
    private final Date returnDate;
    private final Integer numOfAdultPassangers;
    private final Integer numOfChildrenPassangers;
    
    public static final class Builder {
        // Required parameters
        private final String source;
        private final String destination;
        
        // Optional parameters
        private Date departureDate;
        private Date returnDate;
        private Integer numOfAdultPassangers;
        private Integer numOfChildrenPassangers;

        public Builder(String source, String destination) {
            this.source = source;
            this.destination = destination;
        }

        public Builder numOfAdultPassangers(Integer value) {
            numOfAdultPassangers = value;
            return this;
        }

        public Builder departureDate(Date value) {
            departureDate = value;
            return this;
        }

        public Builder returnDate(Date value) {
            returnDate = value;
            return this;
        }

        public FlightSearch buildSearch() {
            return new FlightSearch(this);
        }
    }

    private FlightSearch(Builder builder) {
        source = builder.source;
        destination = builder.destination;
        departureDate = builder.departureDate;
        returnDate = builder.returnDate;
        numOfAdultPassangers = builder.numOfAdultPassangers;
        numOfChildrenPassangers = builder.numOfChildrenPassangers;
    }
}
