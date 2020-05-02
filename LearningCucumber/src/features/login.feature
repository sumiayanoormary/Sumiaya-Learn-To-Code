#Author: sumiayanoormary@gmail.com
#Keywords Summary : Test Cases for Login

@tag
Feature: Login Feature

Background: User should be able to login the page
	Given User in Login Page

  @tag1
  Scenario: Testing login with valid information
    When User enters username
    And User enters password
    And User clicks login button
    Then User should be able to login in
