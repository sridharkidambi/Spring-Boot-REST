package ParllelStreamExamples;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class parallelStreamEx {

    public  static  int sum_sequential_stream(){

        return IntStream.rangeClosed(1,50000).sum();

    }

    public  static  int sum_parallel_stream(){
        return IntStream.rangeClosed(1,50000).parallel().sum();
    }

    public static Long CallMethodStreams(Supplier<Integer> mtd,int count){
        long startTime=System.currentTimeMillis();
        for (int i=0;i<=count;i++){
            mtd.get();
        }

        long endTime=System.currentTimeMillis();

        return endTime-startTime;
    }


    public  static int SequentialStream(List<Integer> intList){
        long start=System.currentTimeMillis();
        int sum = intList.stream().reduce(0,(x,y)->{return  x+y;});
        long endtime=System.currentTimeMillis();
        System.out.println("total time is :" + (endtime-start));
        return  sum;
    }

    public  static int ParallelStream(List<Integer> intList){
        long start=System.currentTimeMillis();
        int sum = intList.stream().parallel().reduce(0,(x,y)->{return  x+y;});
        long endtime=System.currentTimeMillis();
        System.out.println("total time is :" + (endtime-start));
        return  sum;
    }

    public static void main(String[] args) {

        System.out.println(sum_parallel_stream());
//        System.out.println(LocalDateTime.now());

        System.out.println(sum_sequential_stream());
//        System.out.println(LocalDateTime.now());


        System.out.println(CallMethodStreams(parallelStreamEx::sum_parallel_stream,1));
        System.out.println(CallMethodStreams(parallelStreamEx::sum_sequential_stream,1));
        System.out.println("no of processors are : "+ Runtime.getRuntime().availableProcessors());

        List<Integer> items=IntStream.rangeClosed(1,500000).boxed().collect(Collectors.toList());
        System.out.println("output is ");
        System.out.println(ParallelStream(items));
        System.out.println(SequentialStream(items));


    }
}
