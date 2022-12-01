package com.example.weatherapp.business.common


/**
 * This class is used to ensure all mappers implement both of these methods
 */
open class BaseMapper<ModelType, SourceType> : Mapper<ModelType, SourceType> {

    override fun toModel(source: SourceType): ModelType? {
        return null
    }

    override fun fromModel(model: ModelType): SourceType? {
       return null
    }
}