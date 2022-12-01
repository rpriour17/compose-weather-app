package com.example.weatherapp.business.common

interface Mapper<ModelType, SourceType> {
    fun toModel(source: SourceType) : ModelType?
    fun fromModel(model: ModelType) : SourceType?
}