package com.oegeg.etd.saveservicetry2;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class SpqrTestService implements ISpqrTestModelService
{
    private final SpqrTestModelRepository _sqprTestModelRepository;
    @GraphQLMutation(name="createSpqrTestModel")
    public String createSpqrTestModel(@GraphQLArgument(name="input") SpqrTestModelInput input)
    {
        SpqrTestModel model = SpqrTestModel.builder()
                .Name(input.name())
                .build();
        _sqprTestModelRepository.save(model);
        return "saved";
    }

    @GraphQLQuery(name="getAllSpqrTestModels")
    public Iterable<SpqrTestModel> getAllSpqrTestModels()
    {
        Iterable<SpqrTestModel> models = _sqprTestModelRepository.findAll();
        return models;
    }
}
