#!/usr/bin/env groovy

def warning(message) {
    echo "WARNING: ${message}"
    echo ("var: ${JOB_BASE_NAME}" )
}

warning('testing')

def jobName(){
    echo ("${JOB_BASE_NAME}")
}

jobName()
