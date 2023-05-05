package com.hs.all.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRooms {
	public boolean canAttendMeetings(List<Interval> intervals) {
		Collections.sort(intervals, (a, b) -> a.start - b.start);

		for (int i = 0; i + 1 < intervals.size(); i++) {
			if (intervals.get(i).end > intervals.get(i + 1).start) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(0, 30));
		list.add(new Interval(5, 10));
		list.add(new Interval(15, 20));

		MeetingRooms obj = new MeetingRooms();
		boolean res = obj.canAttendMeetings(list);
		System.out.println(res);
	}
}