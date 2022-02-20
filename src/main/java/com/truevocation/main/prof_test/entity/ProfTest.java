package com.truevocation.main.prof_test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;

import com.truevocation.main.question.entity.Question;
import com.truevocation.main.test_result.entity.TestResult;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A ProfTest.
 */
@Entity
@Table(name = "prof_test")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ProfTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Size(max = 1000)
    @Column(name = "description", length = 1000)
    private String description;

    @Size(max = 1000)
    @Column(name = "instruction", length = 1000)
    private String instruction;

    @OneToMany(mappedBy = "profTest")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "answers", "answerUser", "profTest" }, allowSetters = true)
    private Set<Question> questions = new HashSet<>();

    @OneToMany(mappedBy = "profTest")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "appUser", "recommendation", "answerUsers", "profTest" }, allowSetters = true)
    private Set<TestResult> testResults = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public ProfTest id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public ProfTest name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public ProfTest description(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public ProfTest instruction(String instruction) {
        this.setInstruction(instruction);
        return this;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Set<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(Set<Question> questions) {
        if (this.questions != null) {
            this.questions.forEach(i -> i.setProfTest(null));
        }
        if (questions != null) {
            questions.forEach(i -> i.setProfTest(this));
        }
        this.questions = questions;
    }

    public ProfTest questions(Set<Question> questions) {
        this.setQuestions(questions);
        return this;
    }

    public ProfTest addQuestion(Question question) {
        this.questions.add(question);
        question.setProfTest(this);
        return this;
    }

    public ProfTest removeQuestion(Question question) {
        this.questions.remove(question);
        question.setProfTest(null);
        return this;
    }

    public Set<TestResult> getTestResults() {
        return this.testResults;
    }

    public void setTestResults(Set<TestResult> testResults) {
        if (this.testResults != null) {
            this.testResults.forEach(i -> i.setProfTest(null));
        }
        if (testResults != null) {
            testResults.forEach(i -> i.setProfTest(this));
        }
        this.testResults = testResults;
    }

    public ProfTest testResults(Set<TestResult> testResults) {
        this.setTestResults(testResults);
        return this;
    }

    public ProfTest addTestResult(TestResult testResult) {
        this.testResults.add(testResult);
        testResult.setProfTest(this);
        return this;
    }

    public ProfTest removeTestResult(TestResult testResult) {
        this.testResults.remove(testResult);
        testResult.setProfTest(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfTest)) {
            return false;
        }
        return id != null && id.equals(((ProfTest) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProfTest{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", instruction='" + getInstruction() + "'" +
            "}";
    }
}
