<template>
  <div class="home">
    <h1 class="home-title">Login</h1>
    <form @submit.prevent="handleSubmit" class="home-section">
      <Input type="email" v-model="email" :value="email" placeholder="e-mail" />
      <Input type="password" v-model="password" :value="password" placeholder="password" />
      <Button type="submit">Logar</Button>
    </form>
  </div>
</template>

<script>
import Input from "@/components/Input.vue";
import Button from '@/components/Button.vue';
import { required, email } from "vuelidate/lib/validators";

export default {
  name: "home",
  components: {
    Input,
    Button
  },
  data() {
    return {
      email: "",
      password: "",
      submitted: false
    };
  },
  validations: {
    form: {
      password: { required },
      email: { required, email }
    }
  },
  methods: {
    handleSubmit: () => {
      this.submitted = true;
      this.$v.$touch();
      if (this.$v.$invalid) {
        return;
      }
      console.log('logando')
    }
  },
};
</script>

<style lang="scss" scoped>
.home {
  height: 100%;
  display: flex;
  align-items: center;
  flex-direction: column;

  &-title {
    margin: 200px 0 20px;
  }

  &-section {
    width: 350px;
    display: flex;
    flex-direction: column;

    & > input {
      &:not(:last-child) {
        margin-bottom: 20px;
      }
    }
  }
}
</style>

