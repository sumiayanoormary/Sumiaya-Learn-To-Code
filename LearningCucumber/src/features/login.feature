#Author: sumiayanoormary@gmail.com
#Keywords Summary : Test Cases for Login

Feature: Login Feature

  Background: User should be able to login the page
    Given User in Login Page


  Scenario: Testing login with valid information
    When User enters username
    And User enters password
    And User clicks login button
    Then User should be able to login in
