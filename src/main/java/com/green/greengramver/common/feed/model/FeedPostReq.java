package com.green.greengramver.common.feed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FeedPostReq {
    @JsonIgnore
    private long feedId;

    @Schema(title="로그인 유저 PK", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long writerUserId;
    @Schema(title = "피드 내용", example = "피드 내용 테스트")
    private String contents;
    @Schema(title = "피드 위치", example = "그린 컴퓨터 학원")
    private String location;
}
