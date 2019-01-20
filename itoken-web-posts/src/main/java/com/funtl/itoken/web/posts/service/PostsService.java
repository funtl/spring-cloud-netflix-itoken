package com.funtl.itoken.web.posts.service;

import com.funtl.itoken.common.web.service.BaseClientService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "itoken-service-posts")
public interface PostsService extends BaseClientService {

    @RequestMapping(value = "v1/posts/page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public String page(
            @PathVariable(required = true, value = "pageNum") int pageNum,
            @PathVariable(required = true, value = "pageSize") int pageSize,
            @RequestParam(required = false, value = "tbPostsPostJson") String tbPostsPostJson
    );

    @RequestMapping(value = "v1/posts/{postGuid}", method = RequestMethod.GET)
    public String get(
            @PathVariable(required = true, value = "postGuid") String postGuid
    );

    @RequestMapping(value = "v1/posts", method = RequestMethod.POST)
    public String save(
            @RequestParam(required = true, value = "tbPostsPostJson") String tbPostsPostJson,
            @RequestParam(required = true, value = "optsBy") String optsBy
    );
}
