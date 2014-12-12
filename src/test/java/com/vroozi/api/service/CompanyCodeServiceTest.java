package com.vroozi.api.service;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.vroozi.api.conf.AppConfig;
import com.vroozi.api.model.CompanyCode;
import com.vroozi.api.services.CompanyCodeService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class CompanyCodeServiceTest {

  @Autowired
  private CompanyCodeService companyCodeService;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testAddNew() {

    // given
    CompanyCode companyCode = new CompanyCode();
    companyCode.setId("CC-99999");
    companyCode.setActive(true);
    companyCode.setAddressName("Kathmandu, Nepal");
    companyCode.setCurrencyCode("NPR");
    companyCode.setDateCreated(new Date());
    companyCode.setDeleted(false);
    companyCode.setDescription("Test Description");
    companyCode.setName("Test name");
    companyCode.setUnitId("UnitId-12345");

    // when
    CompanyCode resultCompanyCode = this.companyCodeService.addNew(companyCode);

    // then
    assertEquals(resultCompanyCode.getUnitId(), "UnitId-12345");

  }

}
