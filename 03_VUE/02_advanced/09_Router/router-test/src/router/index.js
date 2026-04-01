import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: Home,
      name: 'home',
    },
    {
      path: '/about',
      component: About,
      name: 'about',
    },
    {
      path: '/members',
      component: Members,
      name: 'members',
    },
    {
      path: '/videos',
      component: Videos,
      name: 'videos',
    },
  ],
});

export default router;
