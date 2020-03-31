package com.service.impl;

import com.service.UserService;
import com.util.ExcelUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService {

    private ExcelUtil excelUtil;

    @Override
    public void downLoadExcel() throws Exception {
        List<Map<String,Object>> list = new ArrayList<>();
        excelUtil.downLoadExcel(list);
    }
}
