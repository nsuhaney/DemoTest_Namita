Feature: Navigation through main menu and submenu

  Scenario Outline: Navigation to Megamenu
    Given Automation practice application is opened
    When I navigate through menus <mainmenu> and <submenu>
    Then <productListTitle> is displayed

    Examples: 
      | mainmenu | submenu        | productListTitle |
      | Dresses  | Summer Dresses | SUMMER DRESSES  |
