# Meal-Recipe-App

Project Specification for Group # 221

Team Name: liva lova java flava

Domain: Weight tracker, recipe organizer and price calculator (maybe).

Shape

Software Specification:

The purpose of this program is to provide the user with a weekly meal plan. Given the user’s specified diet, the program will return recipes that satisfy the user’s health goals. This includes things such as daily calories, protein, carbs, etc. intake. The program will require the user to input their list of preferences and dietary requirements through a survey before generating their desired meal plan. The recipes will consist of ingredients (and list of macronutrients), instructions, time required to cook, and cost.



User Stories:

Boris wants to follow a meal plan for the week. He consults a program to obtain recipes. [Team Story]



Gabriel is unsure of how many daily calories he needs to maintain his weight. He is worried that he is not eating enough since he feels hungry all the time. Gabriel uses our app and enters in his weight, age, height and weekly exercise habits and the app returns his recommended daily caloric intake. [Ben’s Story]



Ever since university started, Brian has been increasingly occupied with schoolwork and as a result, has been constantly eating out. Worried about his budget, Brian has decided to attempt cooking some budget-friendly food options from the comfort of his home utilizing our app. He first inputs his weekly budget for meals and opts for the recipe choices that are the most budget friendly. [Gabriel’s story]



Fred does NOT enjoy consuming food and so he only eats once a day, getting all his calories in a single meal. Unsure of whether he is getting the required nutrition, he goes to consult the app by liva lova java flava and can create a balanced meal that meets his dietary needs. [Jack’s Story]



Albert has just been kicked out of the family home and is on his own for the first time. Not knowing the first thing about cooking and meal prep, he turns to a recipe organizer program for help. Being as clueless as he is, Albert wants to work with as little ingredients as possible. With this information, the program generates recipes for Albert. [Iris’ Story]





Proposed Entities for the Domain:

[based on your specification, indicate a few potential entities for your domain — including their names and instance variables]



Meal

(nutrition facts)

-int calories

-float carbohydrates

-float fat

-float protein

-float vitamins

-float sodium

-float cholesterol

-float Potassium

-float Calcium

-float Zinc

-float Magnesium

-float dailyValue



UserProfile

-float weight

-float height

-int age

-list[string] dietary restrictions

-int weeklyBudget

-float BMI

-int rec. daily calories





Recommender

-string recipe URL

-int calories per serving

-float protein per serving

-float fat per serving

-float ingredient price

-list[string] ingredients



Scheduled Meeting Times + Mode of Communication:

Meeting time outside of lab: Saturday afternoon

Mode of Communication: Discord / Instagram 