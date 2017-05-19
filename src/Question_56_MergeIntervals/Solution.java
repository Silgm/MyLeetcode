package Question_56_MergeIntervals;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> values = new LinkedList<>();
        if (intervals.size() != 0) {
            boolean has_merge = false;
            values.add(intervals.get(0));
            for (int i = 1; i < intervals.size(); i++) {
                Interval new_interval = intervals.get(i);
                for (int j = 0; j < values.size(); j++) {
                    if (hasCommonArea(values.get(j), new_interval)
                            || hasCommonArea(new_interval, values.get(j))) {
                        new_interval = merge(new_interval, values.get(j));
                        values.remove(j);
                        has_merge = true;
                        j--;
                    }
                }
                if (!has_merge) {
                    values.add(intervals.get(i));
                } else {
                    values.add(new_interval);
                }
            }
        }
        return values;
    }

    private Interval merge(Interval interval_i, Interval interval_j) {
        return new Interval(interval_i.start < interval_j.start ? interval_i.start :
                interval_j.start, interval_i.end > interval_j.end ? interval_i.end : interval_j.end);
    }

    private boolean hasCommonArea(Interval old_interval, Interval new_interval) {
        return (new_interval.start <= old_interval.end && new_interval.start >= old_interval.start)
                || (new_interval.end <= old_interval.end && new_interval.end >= old_interval.start);
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}