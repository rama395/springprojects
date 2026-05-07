package com.miniproj.IPLTeamService.service;

import com.miniproj.IPLTeamService.entity.IPLTeam;
import com.miniproj.IPLTeamService.repository.IPLTeamRepository;
import com.miniproj.IPLTeamService.vo.IPLTeamVo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class IPLTeamMgmtServiceImplTest
{
    @InjectMocks
    private IPLTeamMgmtServiceImpl iplTeamMgmtService;
    @Mock
    private IPLTeamRepository teamRepository;


    @Test
    public void test_registerIPLTeam_ShouldReturnRegisteredTeamId(){
        IPLTeam iplTeam=new IPLTeam();
        iplTeam.setTeamId(1);
        iplTeam.setTeamName("CSK");
        iplTeam.setArea("chennai");
        iplTeam.setOwner("Rupani");
        IPLTeam iplTeam1=new IPLTeam();
        iplTeam1.setTeamId(200);
        iplTeam1.setTeamName("RCB");
        iplTeam1.setArea("bengaluru");
        iplTeam1.setOwner("Vijay Mallya");
        Mockito.when(teamRepository.save(Mockito.any(IPLTeam.class))).thenReturn(iplTeam);
        IPLTeamVo teamVo=IPLTeamVo.builder().teamName("CSK").area("chennai").owner("Rupani").build();
        assertEquals(iplTeamMgmtService.registerIPLTeam(teamVo),iplTeam.getTeamId());
        Mockito.when(teamRepository.save(Mockito.any(IPLTeam.class))).thenReturn(iplTeam1);
        IPLTeamVo teamVo1=IPLTeamVo.builder().teamName("RCB").area("bengaluru").owner("Vijay Mallya").build();
        assertEquals(iplTeamMgmtService.registerIPLTeam(teamVo1),iplTeam1.getTeamId());
    }

    @Test
    public void test_getTeamById_ShouldReturnTeamDetails() throws Exception{
       IPLTeam iplTeam=new IPLTeam();
       iplTeam.setTeamId(200);
       iplTeam.setTeamName("RCB");
       iplTeam.setArea("bengaluru");
       iplTeam.setOwner("Vijay Mallya");
       Mockito.when(teamRepository.findById(200)).thenReturn(Optional.of(iplTeam));
       IPLTeamVo teamVo=iplTeamMgmtService.getTeamById(200);
       assertNotNull(teamVo);
       assertNotNull(teamVo.getTeamId());
       assertEquals(iplTeam.getTeamId(),teamVo.getTeamId());
       assertEquals(iplTeam.getTeamName(),teamVo.getTeamName());

    }

    @Test
    public void test_getAllTeams_ShouldReturnListOfTeams(){
        IPLTeam iplTeam=new IPLTeam();
        iplTeam.setTeamId(1);
        iplTeam.setTeamName("CSK");
        iplTeam.setArea("chennai");
        iplTeam.setOwner("Rupani");
        IPLTeam iplTeam1=new IPLTeam();
        iplTeam1.setTeamId(200);
        iplTeam1.setTeamName("RCB");
        iplTeam1.setArea("bengaluru");
        iplTeam1.setOwner("Vijay Mallya");
        Mockito.when(teamRepository.findAll()).thenReturn(List.of(iplTeam,iplTeam1));
        List<IPLTeamVo> list=iplTeamMgmtService.getAllTeams();
        assertEquals(2,list.size());
    }





}
