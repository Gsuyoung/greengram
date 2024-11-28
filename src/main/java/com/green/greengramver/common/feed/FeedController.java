package com.green.greengramver.common.feed;

import com.green.greengramver.common.feed.model.FeedPostReq;
import com.green.greengramver.common.feed.model.FeedPostRes;
import com.green.greengramver.common.model.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("feed")
public class FeedController {
    private final FeedService service;

    @PostMapping
    @Operation(summary = "피드 등록", description = "필수: 사진리스트 || 옵션: 위치, 내용")
    public ResultResponse<FeedPostRes> postFeed(@RequestPart List<MultipartFile> pics, @RequestPart FeedPostReq p) {
        FeedPostRes res = service.postFeed(pics,p);
        return ResultResponse.<FeedPostRes>builder().resultMessage("피드 등록 완료").resultData(res).build();
    }
}
