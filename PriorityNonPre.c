#include <stdio.h>

struct Process {
    int pid, at, bt, priority;
    int ct, tat, wt;
    int done;
};

int main() {

    struct Process p[4] = {
        {1, 0, 5, 2, 0, 0, 0, 0},
        {2, 1, 3, 1, 0, 0, 0, 0},
        {3, 2, 8, 4, 0, 0, 0, 0},
        {4, 3, 6, 3, 0, 0, 0, 0}
    };

    int time = 0;
    int completed = 0;
    int n = 4;

    while (completed < n) {
        int highest = -1;

        for (int i = 0; i < n; i++) {
            if (!p[i].done && p[i].at <= time) {
                if (highest == -1 || p[i].priority < p[highest].priority) {
                    highest = i;
                }
            }
        }

        if (highest == -1) {
            time++;
            continue;
        }

        time += p[highest].bt;
        p[highest].ct = time;
        p[highest].tat = p[highest].ct - p[highest].at;
        p[highest].wt = p[highest].tat - p[highest].bt;
        p[highest].done = 1;

        completed++;
    }

    printf("PID\tAT\tBT\tPR\tCT\tTAT\tWT\n");

    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
               p[i].pid,
               p[i].at,
               p[i].bt,
               p[i].priority,
               p[i].ct,
               p[i].tat,
               p[i].wt);
    }

    return 0;
}