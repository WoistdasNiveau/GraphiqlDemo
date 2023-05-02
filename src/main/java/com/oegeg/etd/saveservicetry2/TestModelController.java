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
    @QueryMapping
    Iterable<TestModel> testModels()
    {
        return testModelRepository.findAll();
    }

    @MutationMapping
    public TestModel addTestModel(@Argument TestModelInput model)
    {
        TestModel n = new TestModel();
        n.setName(model.name());
        return testModelRepository.save(n);
    }
}
