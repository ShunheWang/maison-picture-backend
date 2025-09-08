package com.maison.maisonpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.maison.maisonpicturebackend.model.dto.picture.PictureQueryRequest;
import com.maison.maisonpicturebackend.model.dto.picture.PictureReviewRequest;
import com.maison.maisonpicturebackend.model.dto.picture.PictureUploadByBatchRequest;
import com.maison.maisonpicturebackend.model.dto.picture.PictureUploadRequest;
import com.maison.maisonpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.maisonpicturebackend.model.entity.User;
import com.maison.maisonpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author shunhewang
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-09-06 15:36:08
*/
public interface PictureService extends IService<Picture> {



    PictureVO uploadPicture(Object inputSource, PictureUploadRequest pictureUploadRequest, User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);

    /**
     * 批量抓取和创建图片
     *
     * @param pictureUploadByBatchRequest
     * @param loginUser
     * @return 成功创建的图片数
     */
    Integer uploadPictureByBatch(
            PictureUploadByBatchRequest pictureUploadByBatchRequest,
            User loginUser
    );

}
