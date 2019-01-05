package com.hitachi;

import com.hitachi.service.ImportCarLineMapper;
import com.hitachi.domain.ImportCarReadDomain;
import com.hitachi.domain.ImportCarWriteDomain;
import com.hitachi.service.ImportCarItemProcessor;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

public class CoMPASS {
    public static void main(String[] args) throws Exception {

        String[] configLocations = {"mvc-config.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocations);

        JobLauncher jobLauncher = applicationContext.getBean(JobLauncher.class);
        JobRepository jobRepository=applicationContext.getBean(JobRepository.class);
        PlatformTransactionManager transactionManager = applicationContext.getBean(PlatformTransactionManager.class);

        FlatFileItemReader<ImportCarReadDomain> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(new FileSystemResource("src/main/resources/import_car_201810.csv"));
        flatFileItemReader.setLineMapper(new ImportCarLineMapper());

        ImportCarItemProcessor importCarItemProcessor=new ImportCarItemProcessor();

        FlatFileItemWriter<ImportCarWriteDomain> flatFileItemWriter = new FlatFileItemWriter<>();








    }
}
