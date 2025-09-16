package com.maison.maisonpicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.maisonpicturebackend.model.dto.space.analyze.*;
import com.maison.maisonpicturebackend.model.entity.Space;
import com.maison.maisonpicturebackend.model.entity.User;
import com.maison.maisonpicturebackend.model.vo.space.analyze.*;

import java.util.List;

/**
* @author shunhewang
* @createDate 2025-09-14 11:21:46
*/
public interface SpaceAnalyzeService extends IService<Space> {

    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);


    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
