package com.stackroute.ExternalDb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

//@Document
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
//public class Database {
//    @JsonUnwrapped
//   private List<Items> items;
//   private boolean has_more;
//    private long quota_max;
//    private long quota_remaining;
////    private long backoff;



public class Database {
    ArrayList<Object> items = new ArrayList<Object>();
    private boolean has_more;
    private float quota_max;
    private float quota_remaining;


// Getter Methods

    public boolean getHas_more() {
        return has_more;
    }

    public float getQuota_max() {
        return quota_max;
    }

    public float getQuota_remaining() {
        return quota_remaining;
    }

// Setter Methods

    public void setHas_more( boolean has_more ) {
        this.has_more = has_more;
    }

    public void setQuota_max( float quota_max ) {
        this.quota_max = quota_max;
    }

    public void setQuota_remaining( float quota_remaining ) {
        this.quota_remaining = quota_remaining;
    }
}
