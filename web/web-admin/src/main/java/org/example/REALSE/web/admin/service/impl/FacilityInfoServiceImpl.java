package org.example.REALSE.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.REALSE.model.entity.FacilityInfo;
import org.example.REALSE.web.admin.service.FacilityInfoService;
import org.example.REALSE.web.admin.mapper.FacilityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【facility_info(配套信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo>
    implements FacilityInfoService{

}



