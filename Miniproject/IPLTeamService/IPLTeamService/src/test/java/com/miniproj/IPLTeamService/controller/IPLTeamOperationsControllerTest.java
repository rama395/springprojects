package com.miniproj.IPLTeamService.controller;

import com.miniproj.IPLTeamService.entity.IPLTeam;
import com.miniproj.IPLTeamService.service.IPLTeamMgmtService;
import com.miniproj.IPLTeamService.vo.IPLTeamVo;
import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import tools.jackson.databind.ObjectMapper;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(IPLTeamOperationsController.class)
public class IPLTeamOperationsControllerTest
{
    @MockitoBean
    private IPLTeamMgmtService iplTeamMgmtService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testRegisterTeam() throws Exception
    {
        // Prepare test data
        IPLTeamVo teamVo = new IPLTeamVo();
        teamVo.setTeamId(500);
        teamVo.setTeamName("CHENNAI SUPER KINGS");
        teamVo.setOwner("MAHENDRA SINGH DHONI");
        teamVo.setArea("CHENNAI");

        // Mock
        when(iplTeamMgmtService.registerIPLTeam(any(IPLTeamVo.class))).thenReturn(500);

        mockMvc.perform(post("/team-api/register").contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(teamVo)))
                .andExpect(status().isCreated())
                .andDo(print());
    }

    @Test
    public void testShowAllTeams() throws Exception {
       List<IPLTeamVo> teamVo = List.of(
                new IPLTeamVo(1, "CHENNAI SUPER KINGS", "MAHENDRA SINGH DHONI", "CHENNAI"),
                new IPLTeamVo(2, "ROYAL CHALLENGERS BANGALORE", "VIRAT KOHLI", "BANGALORE"),
                new IPLTeamVo(3, "MUMBAI INDIANS", "ROHIT SHARMA", "MUMBAI")
        );
        when(iplTeamMgmtService.getAllTeams()).thenReturn(teamVo);
        mockMvc.perform(get("/team-api/all").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(teamVo.size()))
                .andDo(print());
    }

    @Test
    public void testShowTeamById() throws Exception {
        int teamId = 300;
        IPLTeamVo teamVo = new IPLTeamVo(teamId, "CHENNAI SUPER KINGS", "MAHENDRA SINGH DHONI", "CHENNAI");
        when(iplTeamMgmtService.getTeamById(teamId)).thenReturn(teamVo);
        mockMvc.perform(get("/team-api/find/{id}", teamId).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.teamId").value(teamVo.getTeamId()))
                .andExpect(jsonPath("$.teamName").value(teamVo.getTeamName()))
                .andExpect(jsonPath("$.owner").value(teamVo.getOwner()))
                .andExpect(jsonPath("$.area").value(teamVo.getArea()))
                .andDo(print());
    }


}

