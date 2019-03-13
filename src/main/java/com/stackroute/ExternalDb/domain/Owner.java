package com.stackroute.ExternalDb.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {


      private long reputation;
      private long  user_id;
      private String user_type;
     private long accept_rate;
      private String profile_image;
      private String display_name;
      private String link;
}
