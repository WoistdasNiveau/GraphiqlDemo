package com.oegeg.etd.saveservicetry2;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TestModelController
{
    private final TestModelRepository testModelRepository;
    //@QueryMapping
    Iterable<TestModel> testModels()
    {
        Iterable<TestModel> models = testModelRepository.findAll();
        return models;
    }

    //@MutationMapping
    //public Boolean addTestModel(@Argument TestModelInput testModel)
    //{
    //    TestModel n = new TestModel();
    //    n.setName(testModel.name());
    //    testModelRepository.save(n);
    //    return true;
    //}
}
