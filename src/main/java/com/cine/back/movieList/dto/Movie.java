package com.cine.back.movieList.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class Movie {

    @JsonProperty("id")
    private int movieId;

    // 지금은 트렌드 영화 목록 받고 -> movieId만 사용해서 디테일에 참조
    // 나중에 트렌드 영화 목록 출력할 때 필요
    // @JsonProperty("poster_path")
    // @Column(length = 100)
    // private String posterPath;

    // @JsonProperty("title")
    // @Column(length = 100)
    // private String title;

    // @JsonProperty("overview")
    // @Column(columnDefinition = "TEXT")
    // private String overview;

    // @JsonProperty("release_date")
    // @Column(length = 20)
    // private String releaseDate;

    // @JsonProperty("popularity")
    // @Column(length = 20)
    // private String popularity;

}