package com.stackroute.ExternalDb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;






@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Comment{
    private String comment;
    private long timestamp;
    private long likes;
    User user;
    List<Replies> replies;
}

