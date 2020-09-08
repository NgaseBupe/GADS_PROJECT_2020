package com.bupe.gads_project_2020.services;

import com.bupe.gads_project_2020.models.DataModelLearners;
import com.bupe.gads_project_2020.models.DataModelSkill;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetLearnersAndSkillIqs {//interface for api consumption

    @GET("/api/hours")
    Call<List<DataModelLearners>> getLearners();
    @GET("/api/skilliq")
    Call<List<DataModelSkill>> getSkillIqs();
}