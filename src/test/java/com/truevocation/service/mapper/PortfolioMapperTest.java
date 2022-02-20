package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.portfolio.mapper.PortfolioMapper;
import org.junit.jupiter.api.BeforeEach;

class PortfolioMapperTest {

    private PortfolioMapper portfolioMapper;

    @BeforeEach
    public void setUp() {
        portfolioMapper = new PortfolioMapperImpl();
    }
}
