package io.jaylee.springcloud.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class ApiDTO {
    String apiURL;
    HttpRequestMethod method;
    String apiParamsJSON;
    String executionTime;
}
