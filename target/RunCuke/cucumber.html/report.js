$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance test to validate if the car search page is working fine",
  "description": "Validating if the car search page is working fine by peforming acceptance testing.",
  "id": "acceptance-test-to-validate-if-the-car-search-page-is-working-fine",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 2120877382,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "To validate car search page",
  "description": "",
  "id": "acceptance-test-to-validate-if-the-car-search-page-is-working-fine;to-validate-car-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Search-Cars-positive"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the home page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "buy + sell"
      ],
      "line": 9
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 10
    },
    {
      "cells": [
        "news"
      ],
      "line": 11
    },
    {
      "cells": [
        "advice"
      ],
      "line": 12
    },
    {
      "cells": [
        "pricing + specs"
      ],
      "line": 13
    },
    {
      "cells": [
        "guides"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on \"search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select Any Make as \"BMW\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Any Model as \"1 Series\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select Any Location as \"NSW - All\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Price(max) as \"$10,000\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on \"Find My Next Car\" button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I see a list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the page title should be \"Bmw 1 Series Under 10000 for Sale NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 23
    }
  ],
  "location": "CarSearch.i_am_on_the_home_page(String)"
});
formatter.result({
  "duration": 1979873951,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 616553927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search Cars",
      "offset": 12
    }
  ],
  "location": "CarSearch.i_click_on_link(String)"
});
formatter.result({
  "duration": 607837408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 22
    }
  ],
  "location": "CarSearch.i_select_Any_Make_as(String)"
});
formatter.result({
  "duration": 1697665118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 23
    }
  ],
  "location": "CarSearch.i_select_Any_Model_as(String)"
});
formatter.result({
  "duration": 236011717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - All",
      "offset": 26
    }
  ],
  "location": "CarSearch.i_select_Any_Location_as(String)"
});
formatter.result({
  "duration": 188850754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10,000",
      "offset": 24
    }
  ],
  "location": "CarSearch.i_select_Price_max_as(String)"
});
formatter.result({
  "duration": 320365752,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find My Next Car",
      "offset": 12
    }
  ],
  "location": "CarSearch.i_click_on_button(String)"
});
formatter.result({
  "duration": 313348343,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_see_a_list_of_searched_cars()"
});
formatter.result({
  "duration": 176211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 10000 for Sale NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "CarSearch.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 30026070,
  "status": "passed"
});
formatter.after({
  "duration": 257000046,
  "status": "passed"
});
formatter.uri("UsedCarSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance test to validate if the used car search page is working fine",
  "description": "Validating if the used car search page is working fine by peforming acceptance testing.",
  "id": "acceptance-test-to-validate-if-the-used-car-search-page-is-working-fine",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Car-Search"
    }
  ]
});
formatter.before({
  "duration": 1426874985,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "To validate used car search page",
  "description": "",
  "id": "acceptance-test-to-validate-if-the-used-car-search-page-is-working-fine;to-validate-used-car-search-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Search-Used-Cars-positive"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the home page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "buy + sell"
      ],
      "line": 9
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 10
    },
    {
      "cells": [
        "news"
      ],
      "line": 11
    },
    {
      "cells": [
        "advice"
      ],
      "line": 12
    },
    {
      "cells": [
        "pricing + specs"
      ],
      "line": 13
    },
    {
      "cells": [
        "guides"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on \"Used\" link for used cars page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select Any Make as \"Audi\" from used cars page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Any Model from used cars page as",
  "rows": [
    {
      "cells": [
        "A1"
      ],
      "line": 18
    },
    {
      "cells": [
        "A2"
      ],
      "line": 19
    },
    {
      "cells": [
        "A3"
      ],
      "line": 20
    },
    {
      "cells": [
        "A4"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select Any Location from used cars page as \"ACT - All\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select Price(max) from used cars page as \"$2,000\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on from used cars page \"Find My Next Car\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I see a list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the page title should be \"Used Audi A4 Under 2000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 23
    }
  ],
  "location": "CarSearch.i_am_on_the_home_page(String)"
});
formatter.result({
  "duration": 1992518701,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 2899802931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 12
    }
  ],
  "location": "UsedCarSearch.i_click_on_link_for_used_cars_page(String)"
});
formatter.result({
  "duration": 1027393184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 22
    }
  ],
  "location": "UsedCarSearch.i_select_Any_Make_as_from_used_cars_page(String)"
});
formatter.result({
  "duration": 1964072043,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearch.i_select_Any_Model_from_used_cars_page_as(String\u003e)"
});
formatter.result({
  "duration": 229036906,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 46
    }
  ],
  "location": "UsedCarSearch.i_select_Any_Location_from_used_cars_page_as(String)"
});
formatter.result({
  "duration": 178517317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000",
      "offset": 44
    }
  ],
  "location": "UsedCarSearch.i_select_Price_max_from_used_cars_page_as(String)"
});
formatter.result({
  "duration": 564400622,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find My Next Car",
      "offset": 32
    }
  ],
  "location": "UsedCarSearch.i_click_on_from_used_cars_page(String)"
});
formatter.result({
  "duration": 1369153550,
  "status": "passed"
});
formatter.match({
  "location": "CarSearch.i_see_a_list_of_searched_cars()"
});
formatter.result({
  "duration": 90600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 2000 for Sale ACT | carsguide",
      "offset": 26
    }
  ],
  "location": "CarSearch.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 886401158,
  "status": "passed"
});
formatter.after({
  "duration": 423371663,
  "status": "passed"
});
});