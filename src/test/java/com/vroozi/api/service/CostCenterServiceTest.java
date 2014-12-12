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
import com.vroozi.api.model.CostCenter;
import com.vroozi.api.services.CostCenterService;

/**
 * 
 * @author anishmanandhar<anishmanandhar@lftechnology.com>
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@WebAppConfiguration
public class CostCenterServiceTest {


  @Autowired
  private CostCenterService costCenterService;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testAddNew() {
    // given
    CostCenter costCenter = new CostCenter();
    costCenter.setId("CC-112232321");
    costCenter.setActive(true);
    costCenter.setCode("Code-123");
    costCenter.setCompanyCode("LF-12345");
    costCenter.setDateCreated(new Date());
    costCenter.setDeleted(false);
    costCenter.setDescription("Test Description");
    costCenter.setName("Test name");
    costCenter.setProfitCenter("Test Profit Center");
    costCenter.setUnitId("UnitId-1234");

    // when
    CostCenter resultCostCenter = this.costCenterService.addNew(costCenter);

    // then
    assertEquals(resultCostCenter.getUnitId(), costCenter.getUnitId());
  }
}
