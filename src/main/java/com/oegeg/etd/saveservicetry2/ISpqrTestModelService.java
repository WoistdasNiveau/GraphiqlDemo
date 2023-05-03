package com.oegeg.etd.saveservicetry2;

import io.leangen.graphql.annotations.GraphQLArgument;

public interface ISpqrTestModelService
{
    String createSpqrTestModel(@GraphQLArgument(name="input") SpqrTestModelInput input);
}
