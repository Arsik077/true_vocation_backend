package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.contact.mapper.ContactMapper;
import org.junit.jupiter.api.BeforeEach;

class ContactMapperTest {

    private ContactMapper contactMapper;

    @BeforeEach
    public void setUp() {
        contactMapper = new ContactMapperImpl();
    }
}
