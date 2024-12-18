/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package gbc_azzi800;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class app_gwc_azzi800_open_1_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public app_gwc_azzi800_open_1_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());
    scenarios.add(new scenario_1());
    scenarios.add(new scenario_2());

  }

  /* Scenario app_gwc_azzi800_open_1 id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 381 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 382 (dataType = "STRING", isNull = "0", value = "u") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */

      client.wait(516);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 541 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 542 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en-US") { } }  */

      client.wait(66);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "r") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(2339);
      client.setFocus("formonly.gzxd001");

      client.setValue("tiptop");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(49);
      client.key("tab");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(1375);
      client.setFocus("formonly.gzxd002");

      client.setValue("tiptop");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(65);
      client.key("tab");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(1118);
      client.action("login"); /* 登录 */

      client.wait(29);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 383 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 454 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 453 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(23);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 453 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 454 (dataType = "STRING", isNull = "0", value = "r") { }   FunctionCallParameter 383 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(36);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 383 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 454 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 453 (dataType = "STRING", isNull = "0", value = "2vhMq+GGJmzIU+mZqeS5QKxiETaxWOWkWxBHwFuqzJfSyJr8bzZq43cVgiAPPj1yk9O6VPKvAtom40Pmkk2LgA==") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(19);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 453 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 454 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 383 (dataType = "STRING", isNull = "0", value = "BX6I6p0wh+yh5y8Y1k+n0KBXiln0VGG72jbL4rDr27o=") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

    }
  }
  /* Scenario app_gwc_azzi800_open_1 id: 1 */
  private class scenario_1 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 381 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 382 (dataType = "STRING", isNull = "0", value = "u") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1263);
      client.action("wc_flow_init"); /* wc_flow_init */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(51);
      client.setTableSize("s_startmenu", 45);

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(436);
      client.setFocus("formonly.wc");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(28);
      client.setValue(" ");

      client.action("wc_exec"); /* wc_exec */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(273);
      client.setValue("{\"cmd\":\"handshake\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(23);
      client.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"10.40.41.189\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(442);
      client.setFocus("formonly.searchstr");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2093);
      client.setFocus("formonly.searchstr");

      client.setValue("azzi800");

      client.action("execute"); /* execute */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(7637);
      client.action("logout"); /*  */

      client.wait(32);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "webuser") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(20);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(23);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "x") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(27);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "0", paramCount = "0", moduleName = "gwcjs", name = "reload") { }  */
      /* Front call result: FunctionCallEvent 0 (result = "-2") { }  */

    }
  }
  /* Scenario app_gwc_azzi800_open_1 id: 2 */
  private class scenario_2 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.setTableSize("s_queryplan", 21);

      client.setTableSize("s_relateapps", 15);

      client.setTableSize("s_browse", 38);

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2624);
      client.action("close"); /* close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
