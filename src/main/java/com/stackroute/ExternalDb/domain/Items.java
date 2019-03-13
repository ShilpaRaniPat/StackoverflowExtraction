package com.stackroute.ExternalDb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
    @JsonUnwrapped
    private List<String> tags;
    @JsonUnwrapped
//    private AnswerAt answers;
    private  Owner owner;
    private boolean is_answered;
    private long view_count;
//    private long bounty_amount;
//    private long bounty_closes_date;
    //private long accepted_answer_id;
    private int answer_count;
    private int  score;
    private Date last_activity_date;
    private Date creation_date;
    private Date last_edit_date;
    private long question_id;
    private String link;
    private String title;
//   private  String[] body;
}
