#Author: your.email@your.domain.com
#Keywords Summary : Test Cases for Sign Up
Feature: Sign Up Feature

  Background: User should be able to Sign Up or Registration page
     Given: User in Login Page


  Scenario: Testing Sign Up with valid information
    When User enters First name
    And User enters Last name
    And User enters Mobile number or email
    And User enters Password
    And User enters Birthday
    And User enters Gender
    And User clicks Sign Up button
    Then User should be able to Sign Up