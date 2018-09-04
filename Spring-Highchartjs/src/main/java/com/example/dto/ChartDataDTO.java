package com.example.dto;

public class ChartDataDTO {

    private Long xAxis;
    private Integer yAxis;

    public ChartDataDTO(Long xAxis, Integer yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Long getxAxis() {
        return xAxis;
    }

    public Integer getyAxis() {
        return yAxis;
    }
}
