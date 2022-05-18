package com.c414.dload.mall_backend.service.impl;

import com.c414.dload.mall_backend.nosql.mongodb.document.MemberReadHistory;
import com.c414.dload.mall_backend.nosql.mongodb.repo.MemberReadHistoryRepository;
import com.c414.dload.mall_backend.service.IMemberReadHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MemberReadHistoryServiceImpl implements IMemberReadHistoryService {

    @Resource
    private MemberReadHistoryRepository memberReadHistoryRepository;

    @Override
    public Integer create(MemberReadHistory memberReadHistory) {

        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public Integer delete(List<String> ids) {
        
        List<MemberReadHistory> delList = new ArrayList<>();
        for (String id :
                ids) {
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            delList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(delList);
        return ids.size();
    }

    @Override
    public List<MemberReadHistory> list(Long memberId) {
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
    }
}
