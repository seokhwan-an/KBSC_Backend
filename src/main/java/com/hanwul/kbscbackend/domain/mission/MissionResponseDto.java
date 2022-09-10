package com.hanwul.kbscbackend.domain.mission;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MissionResponseDto {
    private Long id;

    private String content;

    private String category;

    private Boolean isSuccess;
}