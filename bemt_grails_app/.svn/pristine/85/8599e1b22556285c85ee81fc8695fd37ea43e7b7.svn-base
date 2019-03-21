
quartz {
    autoStartup = true
    jdbcStore = false
    waitForJobsToCompleteOnShutdown = true
    exposeSchedulerInRepository = true
}

environments {
    stage {
        quartz {
            autoStartup = true
        }
    }
    test {
        quartz {
            autoStartup = true
        }
    }

    abccdev {
        quartz {
            autoStartup = true
        }
    }
    
    ec2dev {
        quartz {
            autoStartup = false
        }
    }
    
    ec2cdr {
        quartz {
            autoStartup = false
        }
    }
}
