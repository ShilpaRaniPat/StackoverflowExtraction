package com.stackroute.ExternalDb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;






@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Replies{
    private String reply;
    private long likes;
    private long timestamp;
    User user;
}

