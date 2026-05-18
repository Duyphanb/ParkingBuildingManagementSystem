package com.g5.pbms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

// TODO: Scheduler - Auto quét xe Overstay theo cron, Cleanup old records, Generate reports, Send notifications
@Configuration
@EnableScheduling
public class SchedulerConfig {
}

